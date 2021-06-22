package finance.stock.us.world.currency.cryptocurrency.crypto.news.all.share.market.view.`interface`

import finance.stock.us.world.currency.cryptocurrency.crypto.news.all.share.market.view.financeapidata.finance
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

const val BASE_URL_Finance = "https://api.twelvedata.com"
interface FinanceInterface {
    @GET("/time_series?symbol=AAPL,MSFT,EUR/USD,SBUX,NKE&interval=1min&apikey=demo&source=docs")
    fun getfinance(): Call<finance>

}
object Financeservice {
    val financeInstance : FinanceInterface
    init {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL_Finance)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        financeInstance = retrofit.create(FinanceInterface::class.java)

    }
}

