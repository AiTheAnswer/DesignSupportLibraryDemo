package com.allen.snackbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.view.View
import android.widget.Button
import android.widget.Toast

class SnackBarActivity : AppCompatActivity() {

    private var mBtnShowSnackBar: Button? = null
    private var mParentView: View? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snackbar)
        initView()
        initListener()
    }

    private fun initListener() {
        mBtnShowSnackBar?.setOnClickListener {
            Snackbar.make(mParentView!!, "标题", Snackbar.LENGTH_SHORT).setAction("点击事件") {
                Toast.makeText(this, "Toast", Toast.LENGTH_SHORT).show()
            }.setDuration(Snackbar.LENGTH_SHORT).show()
        }
    }

    private fun initView() {
        mParentView = findViewById(R.id.parent_view)
        mBtnShowSnackBar = findViewById(R.id.show_snack_bar)
    }
}
