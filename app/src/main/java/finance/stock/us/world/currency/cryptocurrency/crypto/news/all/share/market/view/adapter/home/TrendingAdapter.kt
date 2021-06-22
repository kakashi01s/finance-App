package finance.stock.us.world.currency.cryptocurrency.crypto.news.all.share.market.view.adapter.home

import android.content.Context
import android.view.ViewGroup
import finance.stock.us.world.currency.cryptocurrency.crypto.news.all.share.market.base.adapter.GenericRecyclerAdapter
import finance.stock.fantasy.hub.online.global.shopping.world.social.all.view.listener.Home.TopInternationalClickListener
import finance.stock.us.world.currency.cryptocurrency.crypto.news.all.share.market.view.viewholder.TopInternationalViewHolder
import finance.stock.us.world.currency.cryptocurrency.crypto.news.all.share.market.R


class TopInternationalAdapter (context: Context?) :
    GenericRecyclerAdapter<List<String>, TopInternationalClickListener<List<String>>, TopInternationalViewHolder>(context) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopInternationalViewHolder {
        return TopInternationalViewHolder(inflate(R.layout.card_trending_layout,parent))
    }
}