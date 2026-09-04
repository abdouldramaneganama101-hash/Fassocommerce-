package com.fassocommerce;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends Activity {

    private final int GREEN = Color.rgb(0, 128, 0);
    private final int YELLOW = Color.rgb(245, 190, 0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ScrollView scrollView = new ScrollView(this);

        LinearLayout main = new LinearLayout(this);
        main.setOrientation(LinearLayout.VERTICAL);
        main.setPadding(24, 24, 24, 40);
        main.setBackgroundColor(Color.WHITE);

        // LOGO
        ImageView logo = new ImageView(this);
        logo.setImageResource(R.drawable.fasso_logo);
        logo.setAdjustViewBounds(true);
        logo.setPadding(0, 10, 0, 20);

        LinearLayout.LayoutParams logoParams =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        300);

        logoParams.gravity = Gravity.CENTER;
        main.addView(logo, logoParams);

        // NOM DE L'APPLICATION
        TextView title = new TextView(this);
        title.setText("FASSO COMMERCE");
        title.setTextSize(28);
        title.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        title.setTextColor(GREEN);
        title.setGravity(Gravity.CENTER);
        main.addView(title);

        TextView slogan = new TextView(this);
        slogan.setText("Votre boutique de matériel");
        slogan.setTextSize(17);
        slogan.setTextColor(Color.DKGRAY);
        slogan.setGravity(Gravity.CENTER);
        slogan.setPadding(0, 8, 0, 25);
        main.addView(slogan);

        // RECHERCHE
        TextView search = new TextView(this);
        search.setText("🔎  Rechercher un produit");
        search.setTextSize(17);
        search.setTextColor(Color.DKGRAY);
        search.setGravity(Gravity.CENTER_VERTICAL);
        search.setPadding(20, 20, 20, 20);
        search.setBackgroundColor(Color.rgb(240, 240, 240));
        main.addView(search);

        // PUBLICITÉ
        TextView advertising = new TextView(this);
        advertising.setText(
                "PUBLICITÉ\n\nDécouvrez nos nouveaux produits");
        advertising.setTextSize(20);
        advertising.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        advertising.setTextColor(Color.WHITE);
        advertising.setGravity(Gravity.CENTER);
        advertising.setPadding(15, 35, 15, 35);
        advertising.setBackgroundColor(GREEN);

        LinearLayout.LayoutParams adParams =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT);

        adParams.setMargins(0, 25, 0, 25);
        main.addView(advertising, adParams);

        // TITRE PRODUITS
        TextView productsTitle = new TextView(this);
        productsTitle.setText("Nos produits");
        productsTitle.setTextSize(24);
        productsTitle.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        productsTitle.setTextColor(Color.BLACK);
        productsTitle.setPadding(0, 10, 0, 15);
        main.addView(productsTitle);

        // PRODUITS
        addProduct(
                main,
                "🛠️  Tondeuse",
                "Matériel de jardinage");

        addProduct(
                main,
                "👔  Fer à repasser",
                "Petit matériel domestique");

        addProduct(
                main,
                "🚗  Aspirateur de véhicule",
                "Petit équipement automobile");

        addProduct(
                main,
                "🔧  Petit compresseur",
                "Matériel et équipement");

        addProduct(
                main,
                "🧯  Extincteur",
                "Équipement de sécurité");

        addProduct(
                main,
                "🔌  Rallonge électrique",
                "Accessoires et matériel");

        // PANIER
        Button cartButton = new Button(this);
        cartButton.setText("🛒  Voir mon panier");
        cartButton.setTextSize(17);
        cartButton.setTextColor(Color.WHITE);
        cartButton.setBackgroundColor(GREEN);

        LinearLayout.LayoutParams cartParams =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT);

        cartParams.setMargins(0, 25, 0, 10);
        main.addView(cartButton, cartParams);

        // COMMANDES
        Button ordersButton = new Button(this);
        ordersButton.setText("📦  Mes commandes");
        ordersButton.setTextSize(17);
        main.addView(ordersButton);

        // PIED DE PAGE
        TextView footer = new TextView(this);
        footer.setText(
                "\nFasso Commerce\n\n" +
                "Achetez facilement et suivez vos commandes.");
        footer.setTextSize(15);
        footer.setGravity(Gravity.CENTER);
        footer.setTextColor(Color.GRAY);
        footer.setPadding(0, 30, 0, 10);
        main.addView(footer);

        scrollView.addView(main);
        setContentView(scrollView);
    }

    private void addProduct(
            LinearLayout main,
            String name,
            String description) {

        LinearLayout card = new LinearLayout(this);
        card.setOrientation(LinearLayout.VERTICAL);
        card.setPadding(20, 18, 20, 18);
        card.setBackgroundColor(Color.rgb(248, 248, 248));

        TextView productName = new TextView(this);
        productName.setText(name);
        productName.setTextSize(20);
        productName.setTypeface(
                Typeface.DEFAULT,
                Typeface.BOLD);
        productName.setTextColor(GREEN);

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
