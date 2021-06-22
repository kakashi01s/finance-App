package finance.stock.us.world.currency.cryptocurrency.crypto.news.all.share.market.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import finance.stock.us.world.currency.cryptocurrency.crypto.news.all.share.market.R
import finance.stock.us.world.currency.cryptocurrency.crypto.news.all.share.market.view.cryptoapidata.Coin

class CryptoAdapter(val context: Context,val coins: List<Coin>) :
    RecyclerView.Adapter<CryptoAdapter.CoinsViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoinsViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.coin_card_layout, parent, false)
        return CoinsViewHolder(view)
    }

    override fun onBindViewHolder(holder: CoinsViewHolder, position: Int) {
        val coins = coins[position]
        holder.coinsymbol.text = coins.symbol
        holder.coinname.text = coins.name
        holder.coinprice.text = coins.price
        Glide.with(context).load(coins.iconUrl).into(holder.coinImage)
    }

    override fun getItemCount(): Int {
        return coins.size
    }

    class CoinsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var coinImage = itemView.findViewById<ImageView>(R.id.coin_icon)
        var coinname = itemView.findViewById<TextView>(R.id.coin_name)
        var coinprice = itemView.findViewById<TextView>(R.id.price_USD)
        var coinsymbol = itemView.findViewById<TextView>(R.id.coin_symbol)


    }

}