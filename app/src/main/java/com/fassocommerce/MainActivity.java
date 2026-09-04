package com.fassocommerce;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends Activity {

    private int green = Color.rgb(0, 128, 0);
    private int yellow = Color.rgb(245, 190, 0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ScrollView scrollView = new ScrollView(this);

        LinearLayout main = new LinearLayout(this);
        main.setOrientation(LinearLayout.VERTICAL);
        main.setPadding(24, 24, 24, 40);
        main.setBackgroundColor(Color.WHITE);

        TextView logo = new TextView(this);
        logo.setText("FASSO COMMERCE");
        logo.setTextSize(28);
        logo.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        logo.setTextColor(green);
        logo.setGravity(Gravity.CENTER);
        logo.setPadding(0, 20, 0, 10);
        main.addView(logo);

        TextView slogan = new TextView(this);
        slogan.setText("Votre boutique de matériel");
        slogan.setTextSize(17);
        slogan.setGravity(Gravity.CENTER);
        slogan.setTextColor(Color.DKGRAY);
        slogan.setPadding(0, 0, 0, 25);
        main.addView(slogan);

        TextView search = new TextView(this);
        search.setText("🔎  Rechercher un produit");
        search.setTextSize(17);
        search.setTextColor(Color.DKGRAY);
        search.setGravity(Gravity.CENTER_VERTICAL);
        search.setPadding(20, 20, 20, 20);
        search.setBackgroundColor(Color.rgb(240, 240, 240));
        main.addView(search);

        TextView advertising = new TextView(this);
        advertising.setText("PUBLICITÉ\nDécouvrez nos nouveaux produits");
        advertising.setTextSize(20);
        advertising.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        advertising.setTextColor(Color.WHITE);
        advertising.setGravity(Gravity.CENTER);
        advertising.setPadding(15, 35, 15, 35);
        advertising.setBackgroundColor(green);

        LinearLayout.LayoutParams adParams =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT);
        adParams.setMargins(0, 25, 0, 25);
        main.addView(advertising, adParams);

        TextView title = new TextView(this);
        title.setText("Nos produits");
        title.setTextSize(24);
        title.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        title.setTextColor(Color.BLACK);
        title.setPadding(0, 10, 0, 15);
        main.addView(title);

        addProduct(main, "🛠️  Tondeuse", "Matériel de jardinage");
        addProduct(main, "👔  Fer à repasser", "Petit matériel domestique");
        addProduct(main, "🚗  Aspirateur de véhicule", "Petit équipement automobile");
        addProduct(main, "🔧  Petit compresseur", "Matériel et équipement");

        Button cartButton = new Button(this);
        cartButton.setText("🛒  Voir mon panier");
        cartButton.setTextSize(17);
        cartButton.setTextColor(Color.WHITE);
        cartButton.setBackgroundColor(green);

        LinearLayout.LayoutParams buttonParams =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT);
        buttonParams.setMargins(0, 25, 0, 10);
        main.addView(cartButton, buttonParams);

        Button ordersButton = new Button(this);
        ordersButton.setText("📦  Mes commandes");
        ordersButton.setTextSize(17);
        main.addView(ordersButton);

        TextView footer = new TextView(this);
        footer.setText("\nFasso Commerce\nAchetez facilement et suivez vos commandes.");
        footer.setTextSize(15);
        footer.setGravity(Gravity.CENTER);
        footer.setTextColor(Color.GRAY);
        footer.setPadding(0, 30, 0, 10);
        main.addView(footer);

        scrollView.addView(main);
        setContentView(scrollView);
    }

    private void addProduct(LinearLayout main, String name, String description) {

        LinearLayout card = new LinearLayout(this);
        card.setOrientation(LinearLayout.VERTICAL);
        card.setPadding(20, 18, 20, 18);
        card.setBackgroundColor(Color.rgb(248, 248, 248));

        TextView productName = new TextView(this);
        productName.setText(name);
        productName.setTextSize(20);
        productName.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        productName.setTextColor(green);

        TextView productDescription = new TextView(this);
        productDescription.setText(description);
        productDescription.setTextSize(15);
        productDescription.setTextColor(Color.DKGRAY);
        productDescription.setPadding(0, 8, 0, 12);

        Button viewButton = new Button(this);
        viewButton.setText("Voir le produit");

        card.addView(productName);
        card.addView(productDescription);
        card.addView(viewButton);

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT);
        params.setMargins(0, 0, 0, 15);

        main.addView(card, params);
    }
                          }
