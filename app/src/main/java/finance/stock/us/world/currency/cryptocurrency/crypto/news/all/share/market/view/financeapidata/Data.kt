package finance.stock.us.world.currency.cryptocurrency.crypto.news.all.share.market.view.financeapidata


import com.google.gson.annotations.SerializedName

data class Data(
    val symbol: String,
    val name: String,
    val currency: String,
    val exchange: String,
    val country: String,
    val type: String
)