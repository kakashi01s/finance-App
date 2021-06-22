package finance.stock.us.world.currency.cryptocurrency.crypto.news.all.share.market.view.listener

import finance.stock.us.world.currency.cryptocurrency.crypto.news.all.share.market.base.listener.BaseRecyclerListener

interface MostUsefulAppsItemClickListener <T> : BaseRecyclerListener {
    fun onMostUsefulAppsCardClick(item: T)
}