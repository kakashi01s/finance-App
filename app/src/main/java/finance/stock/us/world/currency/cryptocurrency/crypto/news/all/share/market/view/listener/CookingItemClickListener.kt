package finance.stock.us.world.currency.cryptocurrency.crypto.news.all.share.market.view.listener

import finance.stock.us.world.currency.cryptocurrency.crypto.news.all.share.market.base.listener.BaseRecyclerListener

interface CookingItemClickListener <T> : BaseRecyclerListener {

    fun onCookingChannelsCardClick(item: T)
}