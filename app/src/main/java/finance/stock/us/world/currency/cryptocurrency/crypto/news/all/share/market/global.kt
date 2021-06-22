package finance.stock.us.world.currency.cryptocurrency.crypto.news.all.share.market

import android.app.Application
import android.content.Intent
import android.util.Log
import com.facebook.ads.AdSettings
import com.facebook.ads.AudienceNetworkAds
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.onesignal.OneSignal
import finance.stock.us.world.currency.cryptocurrency.crypto.news.all.share.market.data.DataFactory
import finance.stock.us.world.currency.cryptocurrency.crypto.news.all.share.market.data.DataService
import finance.stock.us.world.currency.cryptocurrency.crypto.news.all.share.market.utils.Constants
import finance.stock.us.world.currency.cryptocurrency.crypto.news.all.share.market.utils.ForceUpdateChecker
import finance.stock.us.world.currency.cryptocurrency.crypto.news.all.share.market.view.WebActivity
import io.reactivex.Scheduler
import io.reactivex.plugins.RxJavaPlugins
import io.reactivex.schedulers.Schedulers
import org.json.JSONObject
import java.util.*

class global : Application() {
    private var dataService: DataService? = null
    private var scheduler: Scheduler? = null
    private val ONESIGNAL_APP_ID = "285284f8-5bc8-4f11-ad58-30ebde4dbec3"

    companion object{

        var application: global? = null

        fun get(): global? {
            return application
        }
    }


    override fun onCreate() {
        super.onCreate()
        application = this

        //        OneSignal Implementation

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        OneSignal.initWithContext(this);
        OneSignal.setAppId(ONESIGNAL_APP_ID)
        OneSignal.setNotificationOpenedHandler {
            if(it.notification.additionalData!=null){
                val data: JSONObject = it.notification.additionalData
                var customKey: String?

                if (data != null) {
                    customKey = data.optString("customkey", null)

                    if (customKey != null) {
                        val intent: Intent = Intent(applicationContext, WebActivity::class.java)
                        intent.putExtra("url", customKey)
                        startActivity(intent)
                    }
                }
            }
        }

        RxJavaPlugins.setErrorHandler { throwable: Throwable ->
            Log.e(
                "TAG",
                "onCreate: " + throwable.message
            )
        }

        AudienceNetworkAds.initialize(this);
        if(BuildConfig.DEBUG){
            AdSettings.setIntegrationErrorMode(AdSettings.IntegrationErrorMode.INTEGRATION_ERROR_CRASH_DEBUG_MODE);
        }


        if (BuildConfig.DEBUG){
            AdSettings.setTestMode(true);
        }else{
            AdSettings.setTestMode(false);
        }

        val firebaseRemoteConfig: FirebaseRemoteConfig = FirebaseRemoteConfig.getInstance()

        // set in-app defaults

        // set in-app defaults

        // set in-app defaults
        val remoteConfigDefaults = TreeMap<String?, Any?>()
        remoteConfigDefaults[Constants().SHOW_ADS] = false
        remoteConfigDefaults[ForceUpdateChecker().KEY_UPDATE_REQUIRED] = false
        remoteConfigDefaults[ForceUpdateChecker().KEY_CURRENT_VERSION] = "1.0"
        remoteConfigDefaults[ForceUpdateChecker().KEY_UPDATE_URL] =
            "https://play.google.com/store/apps/details?id="+applicationContext.packageName

        firebaseRemoteConfig.setDefaultsAsync(remoteConfigDefaults)
        firebaseRemoteConfig.fetch(300) // fetch every minutes
            .addOnCompleteListener(OnCompleteListener<Void?> { task ->
                if (task.isSuccessful) {
                    Log.d("TAG", "remote config is fetched.$task")
                    firebaseRemoteConfig.activate()
                    Log.d(
                        "TAG",
                        "onComplete: " + firebaseRemoteConfig.getString("banner_facebook_ads")
                    )
                }
            })

    }
    fun getDataService(): DataService? {
        val dataService by lazy {
            DataFactory.create()
        }
        return dataService
    }

    fun subscribeScheduler(): Scheduler? {
        if (scheduler == null) {
            scheduler = Schedulers.io()
        }
        return scheduler
    }


}