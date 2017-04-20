package fvi.at.ua.drawcirle;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

public class Circle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_circle);
        setContentView(new MyCircle(this));


    }

  public class MyCircle extends View{

      public MyCircle(Context context) {
          super(context);
      }

    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);

        int x = getWidth();
        int y = getHeight();
        int radius = 100;

        Paint paint = new Paint();
        paint.setColor(Color.WHITE);
        canvas.drawPaint(paint);
        paint.setColor(Color.parseColor("#da4747"));
        canvas.drawCircle(x/2, y/2, radius, paint);

    }
  }



}
