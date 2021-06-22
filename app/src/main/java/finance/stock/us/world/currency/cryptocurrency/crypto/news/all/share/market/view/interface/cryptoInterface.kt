package finance.stock.us.world.currency.cryptocurrency.crypto.news.all.share.market.view.`interface`

import finance.stock.us.world.currency.cryptocurrency.crypto.news.all.share.market.view.cryptoapidata.Data
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Headers

const val Base_url_crypto = "https://api.coinranking.com"
interface cryptoInterface {

    @GET("/v2/coins")
    @Headers("x-access-token: coinranking050de78ca49cf6c52a34bdeabf653a6874d92094f14270cd")
    fun getcoins() : Call<Data>

}
object coinsservice {
    val coinsInstance : cryptoInterface
    init {
        val retrofit = Retrofit.Builder()
            .baseUrl(Base_url_crypto)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        coinsInstance = retrofit.create(cryptoInterface::class.java)

    }
}

