package finance.stock.us.world.currency.cryptocurrency.crypto.news.all.share.market.view.adapter

import android.content.Context
import android.view.ViewGroup
import finance.stock.us.world.currency.cryptocurrency.crypto.news.all.share.market.base.adapter.GenericRecyclerAdapter
import finance.stock.us.world.currency.cryptocurrency.crypto.news.all.share.market.view.listener.MostUsefulAppsItemClickListener
import finance.stock.us.world.currency.cryptocurrency.crypto.news.all.share.market.view.viewholder.MostUsefulAppsViewHolder
import finance.stock.us.world.currency.cryptocurrency.crypto.news.all.share.market.R

class MostUsefulAppsAdapter(context: Context?) :
    GenericRecyclerAdapter<List<String>, MostUsefulAppsItemClickListener<List<String>>, MostUsefulAppsViewHolder>(context) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MostUsefulAppsViewHolder {
        return MostUsefulAppsViewHolder(inflate(R.layout.card_all_apps_portal_layout,parent))
    }
}