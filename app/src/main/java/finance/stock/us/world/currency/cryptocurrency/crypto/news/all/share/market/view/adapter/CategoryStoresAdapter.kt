package finance.stock.us.world.currency.cryptocurrency.crypto.news.all.share.market.view.adapter

import android.content.Context
import android.view.ViewGroup
import finance.stock.us.world.currency.cryptocurrency.crypto.news.all.share.market.base.adapter.GenericRecyclerAdapter
import finance.stock.us.world.currency.cryptocurrency.crypto.news.all.share.market.view.listener.CategoryStoresItemClickListener
import finance.stock.us.world.currency.cryptocurrency.crypto.news.all.share.market.view.viewholder.CategoryStoresViewHolder
import finance.stock.us.world.currency.cryptocurrency.crypto.news.all.share.market.R

class CategoryStoresAdapter(context: Context?) :
    GenericRecyclerAdapter<List<String>, CategoryStoresItemClickListener<List<String>>, CategoryStoresViewHolder>(context) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryStoresViewHolder {
        return CategoryStoresViewHolder(inflate(R.layout.card_all_apps_portal_layout,parent))
    }
}