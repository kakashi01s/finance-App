package finance.stock.us.world.currency.cryptocurrency.crypto.news.all.share.market.view.adapter

import android.content.Context
import android.view.ViewGroup
import finance.stock.us.world.currency.cryptocurrency.crypto.news.all.share.market.base.adapter.GenericRecyclerAdapter
import finance.stock.us.world.currency.cryptocurrency.crypto.news.all.share.market.view.listener.CookingItemClickListener
import finance.stock.us.world.currency.cryptocurrency.crypto.news.all.share.market.view.viewholder.CookingChannelsViewHolder
import finance.stock.us.world.currency.cryptocurrency.crypto.news.all.share.market.R

class CookingChannelsAdapter(context: Context?) :
    GenericRecyclerAdapter<List<String>, CookingItemClickListener<List<String>>, CookingChannelsViewHolder>(context) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CookingChannelsViewHolder {
        return CookingChannelsViewHolder(inflate(R.layout.card_all_apps_portal_layout,parent))
    }
}