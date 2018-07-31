package com.allen.designsupportlibrarydemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.allen.coordinatorlayout.CoordinatorLayoutActivity
import com.allen.coordinatorlayout.FoldToolbarActivity
import com.allen.snackbar.SnackBarActivity

class MainActivity : AppCompatActivity() {

    private var mBtnSnackBar: Button? = null
    private var mBtnSlideToolbar: Button? = null
    private var mBtnFoldToolbar: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        initListener()
    }

    private fun initListener() {
        mBtnSnackBar?.setOnClickListener {
            startActivity(Intent(this, SnackBarActivity::class.java))
        }
        mBtnSlideToolbar?.setOnClickListener {
            startActivity(Intent(this, CoordinatorLayoutActivity::class.java))
        }
        mBtnFoldToolbar?.setOnClickListener{
            startActivity(Intent(this,FoldToolbarActivity::class.java))
        }
    }

    private fun initView() {
        mBtnSnackBar = findViewById(R.id.snack_bar)
        mBtnSlideToolbar = findViewById(R.id.slide_toolbar)
        mBtnFoldToolbar = findViewById(R.id.fold_toolbar)
    }
}
