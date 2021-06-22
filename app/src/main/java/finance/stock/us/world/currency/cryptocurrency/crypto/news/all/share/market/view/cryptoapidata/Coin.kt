package finance.stock.us.world.currency.cryptocurrency.crypto.news.all.share.market.view.cryptoapidata


import com.google.gson.annotations.SerializedName

data class Coin(
    val uuid: String,
    val symbol: String,
    val name: String,
    val color: String,
    val iconUrl: String,
    val marketCap: String,
    val price: String,
    val listedAt: Int,
    val tier: Int,
    val change: String,
    val rank: Int,
    val sparkline: List<String>,
    val lowVolume: Boolean,
    val coinrankingUrl: String,
    @SerializedName("24hVolume")
    val hVolume: String,
    val btcPrice: String
)