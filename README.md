### 实验内容：关于线性布局、约束布局及表格布局的使用

### 主要代码：

###### 主界面：
```
      btn_ll = findViewById(R.id.btn_ll);
      btn_cl = findViewById(R.id.btn_cl);
      btn_tl = findViewById(R.id.btn_tl);
```
```
   private void setListeners() {
        OnClick onClick = new OnClick();
        btn_ll.setOnClickListener(onClick);
        btn_cl.setOnClickListener(onClick);
        btn_tl.setOnClickListener(onClick);
    }
    private class OnClick implements View.OnClickListener {
        Intent intent;
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_ll :
                    intent = new Intent(MainActivity.this,LinearLayoutActivity.class);
                    break;
                case R.id.btn_cl :
                    intent = new Intent(MainActivity.this,ConstraintLayoutActivity.class);
                    break;
                case R.id.btn_tl :
                    intent = new Intent(MainActivity.this,TableLayoutActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
```

###### 线性布局：
```
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:background="@color/colorBlack"
    tools:context=".LinearLayoutActivity"
    android:padding="5dp">
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="One,One"
            android:textSize="18sp"
            android:textColor="@color/colorGrey"
            android:textAllCaps="false"
            android:background="@drawable/shape_button"
            android:layout_marginRight="5dp"/>
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="One,Two"
            android:textSize="18sp"
            android:textColor="@color/colorGrey"
            android:textAllCaps="false"
            android:background="@drawable/shape_button"
            android:layout_marginRight="5dp"/>
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="One,Three"
            android:textSize="18sp"
            android:textColor="@color/colorGrey"
            android:textAllCaps="false"
            android:background="@drawable/shape_button"
            android:layout_marginRight="5dp"/>
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="One,Four"
            android:textSize="18sp"
            android:textColor="@color/colorGrey"
            android:textAllCaps="false"
            android:background="@drawable/shape_button" />
    </LinearLayout>
    ...
    ...
</LinearLayout>
```

###### 约束布局：
```
 <android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/colorBlack"
    android:minHeight="0dp"
    tools:context=".ConstraintLayoutActivity">

    <Button
        android:id="@+id/bt_red"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:layout_marginEnd="344dp"
        android:background="@color/colorRed"
        android:text="Red"
        android:textSize="25sp"
        app:layout_constraintBottom_toBottomOf="@+id/bt_orange"
        app:layout_constraintEnd_toStartOf="@+id/bt_orange"
        app:layout_constraintHorizontal_bias="0.0"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="@+id/bt_orange"
        app:layout_constraintVertical_bias="0.0" />
        ...
        ...
</android.support.constraint.ConstraintLayout>
```

###### 表格布局：
```
  ...
  <TableRow>
        <TextView
            android:paddingLeft="20dp"
            android:text="@string/open"
            android:textSize="25sp"
            android:textColor="@color/colorGrey"
            android:layout_column="0"/>
        <TextView
            android:text="Ctrl-O"
            android:textSize="25sp"
            android:textColor="@color/colorGrey"
            android:layout_column="2"
            android:gravity="right"/>
    </TableRow>
    ...
```
```
    ...
    <TableRow>
        <View android:layout_height="3dp"
            android:background="@color/colorGrey"/>
        <View android:layout_height="3dp"
            android:background="@color/colorGrey"
            android:layout_column="2"/>
    </TableRow>
    ...
```

### 截图：

##### ①总界面：
![image](https://i.loli.net/2019/03/16/5c8cf614dfc87.png)
##### ②线性布局：
![image](https://i.loli.net/2019/03/16/5c8cf614e1479.png)
##### ③约束布局：
![image](https://i.loli.net/2019/03/16/5c8cf614dd5f6.png)
##### ④表格布局：
![image](https://i.loli.net/2019/03/16/5c8cf614e2ee0.png)
