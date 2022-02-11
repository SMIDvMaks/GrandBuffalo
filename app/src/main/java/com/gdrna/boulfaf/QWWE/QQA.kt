package com.gdrna.boulfaf.QWWE

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log

import android.widget.ImageView
import android.widget.Toast
import com.gdrna.boulfaf.R
import kotlinx.android.synthetic.main.activity_qqa.*


class QQA : AppCompatActivity() {
    var handler = Handler()
    lateinit var ArikEasy: Array<Int>
    lateinit var ArikHard: Array<Int>
    var one = 2131165398
    var two = 2131165399
    var three = 2131165400
    var four = 2131165397
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qqa)
        window.addFlags(1024)


        ArikEasy = arrayOf(R.drawable.a3, R.drawable.a4, R.drawable.a5, R.drawable.a6)
        ArikHard = arrayOf(
            R.drawable.a1,
            R.drawable.a2,
            R.drawable.a3,
            R.drawable.a4,
            R.drawable.a5,
            R.drawable.a6
        )



        start1.setOnClickListener {
            startSlider(orel, volk)
        }

        next.setOnClickListener {
            startS(orel, volk, vedmid, olen, tyz, korol)
        }

        start2.setOnClickListener {
            startSlider(vedmid, olen)
        }
        start3.setOnClickListener {
            sta(tyz,korol)
        }


    }


    private fun startSlider(imageView: ImageView, imageView2: ImageView) {

        handler.post(object : Runnable {
            var stop = 0
            override fun run() {
                stop++
                if (stop != 60) {
                    handler.postDelayed(this::run, 30)
                    ArikEasy.shuffle()
                    imageView.setImageResource(ArikEasy[1])
                    imageView.tag = ArikEasy[1]
                    ArikEasy.shuffle()
                    imageView2.setImageResource(ArikEasy[0])
                    imageView2.tag = ArikEasy[0]

                } else if (imageView.tag.equals(imageView2.tag)) {
                    txt_score.append("+ 1000")
                    Toast.makeText(this@QQA, "You WIN", Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(this@QQA, "You LOST", Toast.LENGTH_SHORT).show()
                }
            }
        })

    }

    private fun startS(
        imageView1: ImageView, imageView2: ImageView,
        imageView3: ImageView, imageView4: ImageView,
        imageView5: ImageView, imageView6: ImageView
    ) {

        handler.post(object : Runnable {
            var stop = 0
            override fun run() {
                stop++
                if (stop != 60) {
                    handler.postDelayed(this::run, 30)
                    ArikHard.shuffle()
                    imageView1.setImageResource(ArikHard[0])
                    imageView1.tag = ArikHard[0]
                    ArikHard.shuffle()
                    imageView2.setImageResource(ArikHard[1])
                    imageView2.tag = ArikHard[1]
                    ArikHard.shuffle()
                    imageView3.setImageResource(ArikHard[2])
                    imageView3.tag = ArikHard[2]
                    ArikHard.shuffle()
                    imageView4.setImageResource(ArikHard[3])
                    imageView4.tag = ArikHard[3]
                    ArikHard.shuffle()
                    imageView5.setImageResource(ArikHard[4])
                    imageView5.tag = ArikHard[4]
                    ArikHard.shuffle()
                    imageView6.setImageResource(ArikHard[5])
                    imageView6.tag = ArikHard[5]

                } else if (imageView1.tag.equals(imageView2.tag) && imageView1.tag.equals(imageView3.tag)
                    && imageView1.tag.equals(imageView4.tag) && imageView1.tag.equals(imageView5.tag)
                    && imageView1.tag.equals(imageView6.tag)) { txt_score.append("+ 10000")
                    Toast.makeText(this@QQA, "You WIN JACKPOT", Toast.LENGTH_SHORT).show() }
                else{
                    if (imageView1.tag.equals(imageView2.tag)&&imageView1.tag.equals(imageView3.tag)&&imageView1.tag.equals(imageView4.tag)){
                        Toast.makeText(this@QQA, "Almost, try again", Toast.LENGTH_SHORT).show()
                    }else if (imageView2.tag.equals(imageView3.tag)&&imageView2.tag.equals(imageView4.tag)&&imageView2.tag.equals(imageView5.tag)){
                        Toast.makeText(this@QQA, "Almost, try again", Toast.LENGTH_SHORT).show()
                    }else Toast.makeText(this@QQA, "You LOST", Toast.LENGTH_SHORT).show()
                }


            }
        })

    }
    private fun sta(imageView: ImageView, imageView2: ImageView) {

        handler.post(object : Runnable {
            var stop = 0
            override fun run() {
                stop++
                if (stop != 60) {
                    handler.postDelayed(this::run, 30)
                    ArikHard.shuffle()
                    imageView.setImageResource(ArikHard[1])
                    imageView.tag = ArikHard[1]
                    ArikHard.shuffle()
                    imageView2.setImageResource(ArikHard[0])
                    imageView2.tag = ArikHard[0]

                } else if (imageView.tag.equals(imageView2.tag)) {
                    txt_score.append("+ 1000")
                    Toast.makeText(this@QQA, "You WIN", Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(this@QQA, "You LOST", Toast.LENGTH_SHORT).show()
                }
            }
        })

    }



}