package com.web.listview;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFOpener extends AppCompatActivity {
PDFView myPDFViewer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfopener);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null)
        {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);

        }

        myPDFViewer =(PDFView)findViewById(R.id.pdfViewer);
String getitem = getIntent().getStringExtra("pdfFileName");

if(getitem.equals("a")){
    myPDFViewer.fromAsset("one.pdf").load();
}
        if(getitem.equals("b")){
            myPDFViewer.fromAsset("two.pdf").load();
        }

        if(getitem.equals("c")){
            myPDFViewer.fromAsset("one.pdf").load();
        }
        if(getitem.equals("d")){
            myPDFViewer.fromAsset("two.pdf").load();
        }
        if(getitem.equals("e")){
            myPDFViewer.fromAsset("one.pdf").load();
        }
        if(getitem.equals("f")){
            myPDFViewer.fromAsset("two.pdf").load();
        }
        if(getitem.equals("g")){
            myPDFViewer.fromAsset("one.pdf").load();
        }if(getitem.equals("g")){
            myPDFViewer.fromAsset("two.pdf").load();
        }if(getitem.equals("i")){
            myPDFViewer.fromAsset("one.pdf").load();
        }if(getitem.equals("j")){
            myPDFViewer.fromAsset("two.pdf").load();
        }if(getitem.equals("k")){
            myPDFViewer.fromAsset("one.pdf").load();
        }if(getitem.equals("l")){
            myPDFViewer.fromAsset("two.pdf").load();
        }if(getitem.equals("m")){
            myPDFViewer.fromAsset("one.pdf").load();
        }if(getitem.equals("n")){
            myPDFViewer.fromAsset("two.pdf").load();
        }if(getitem.equals("o")){
            myPDFViewer.fromAsset("one.pdf").load();
        }
        if(getitem.equals("p")){
            myPDFViewer.fromAsset("two.pdf").load();
        }if(getitem.equals("q")){
            myPDFViewer.fromAsset("one.pdf").load();
        }if(getitem.equals("r")){
            myPDFViewer.fromAsset("two.pdf").load();
        }if(getitem.equals("s")){
            myPDFViewer.fromAsset("one.pdf").load();
        }if(getitem.equals("t")){
            myPDFViewer.fromAsset("two.pdf").load();
        }if(getitem.equals("u")){
            myPDFViewer.fromAsset("one.pdf").load();
        }if(getitem.equals("v")){
            myPDFViewer.fromAsset("two.pdf").load();
        }if(getitem.equals("w")){
            myPDFViewer.fromAsset("one.pdf").load();
        }if(getitem.equals("x")){
            myPDFViewer.fromAsset("two.pdf").load();
        }if(getitem.equals("y")){
            myPDFViewer.fromAsset("one.pdf").load();
        }
        if(getitem.equals("z")){
            myPDFViewer.fromAsset("two.pdf").load();
        }
    }
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }

}
