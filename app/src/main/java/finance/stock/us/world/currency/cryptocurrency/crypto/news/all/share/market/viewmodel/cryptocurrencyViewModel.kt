package finance.stock.us.world.currency.cryptocurrency.crypto.news.all.share.market.viewmodel



class cryptocurrencyViewModel{

    var uuid : String? = null
    var symbol : String? = null
    var name : String? = null
    var iconUrl : String? = null
    var marketCap : String? = null
    var price : String? = null
    constructor()
    constructor(uuid: String,symbol : String, name : String, iconUrl : String, marketCap : String, price : String){
        this.uuid = uuid
        this.iconUrl = iconUrl
        this.name = name
        this.marketCap = marketCap
        this.price = price
        this.symbol = symbol
    }


}