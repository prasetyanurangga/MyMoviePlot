package com.prasetyanurangga.mymovieplot.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.prasetyanurangga.mymovieplot.R
import com.prasetyanurangga.mymovieplot.data.model.MovieModel
import com.prasetyanurangga.mymovieplot.util.Constanta
import com.squareup.picasso.Picasso

class MoviePopularAdapter(
    val context: Context,
    private var movieList: List<MovieModel>
): RecyclerView.Adapter<MoviePopularAdapter.ProductViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        return ProductViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_popular, parent, false))
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bindItem(movieList[position], context);

        holder.itemView.setOnClickListener {
//            val intent: Intent = Intent(context, DetailProductActivity::class.java)
//            intent.putExtra("id_product", movieList[position].id)
//            context.startActivity(intent)
        }
    }

    class ProductViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private  val popularTitle: TextView = view.findViewById(R.id.txt_popular)
        private  val popularImage: ImageView = view.findViewById(R.id.imgv_popular)

        fun bindItem(items: MovieModel, context: Context){
            popularTitle.text = items.title
            Picasso.with(context).load(Constanta.base_url+items.posterPath).placeholder(R.drawable.image_not_found).error(R.drawable.image_not_found).into(popularImage)
       }
    }

}




