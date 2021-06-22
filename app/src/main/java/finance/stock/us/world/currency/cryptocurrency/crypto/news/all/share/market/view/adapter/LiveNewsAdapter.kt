package finance.stock.us.world.currency.cryptocurrency.crypto.news.all.share.market.view.adapter

import android.content.Context
import android.view.ViewGroup
import finance.stock.us.world.currency.cryptocurrency.crypto.news.all.share.market.base.adapter.GenericRecyclerAdapter
import finance.stock.us.world.currency.cryptocurrency.crypto.news.all.share.market.view.listener.LiveNewsItemClickListener
import finance.stock.us.world.currency.cryptocurrency.crypto.news.all.share.market.view.viewholder.LiveNewsViewHolder
import finance.stock.us.world.currency.cryptocurrency.crypto.news.all.share.market.R

class LiveNewsAdapter(context: Context?) :
    GenericRecyclerAdapter<List<String>, LiveNewsItemClickListener<List<String>>, LiveNewsViewHolder>(context) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LiveNewsViewHolder {
        return LiveNewsViewHolder(inflate(R.layout.card_all_apps_portal_layout,parent))
    }
}