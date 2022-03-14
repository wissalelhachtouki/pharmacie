package com.example.pharmacie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.pharmacie.adapter.PharmacieAdapter;
import com.example.pharmacie.beans.Produit;
import com.example.pharmacie.service.ProduitService;

public class ListPharmacieActivity extends AppCompatActivity {
    ListView list;
    ProduitService ps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pharmacie);
        ps=new ProduitService();
        list= findViewById(R.id.liste);

        ps.Create(new Produit("Doliprane", 2, R.mipmap.dolip, "25 min", "Excipients : povidone, amidon prégélatinisé, carboxyméthylamidon sodique (type A), talc, stéarate de magnésium, hydroxypropylcellulose, hypromellose, macrogol 6000. Enveloppe : gélatine, azorubine (E122), jaune de quinoléine (E104), oxyde de fer jaune (E172).","Doliprane est un médicament sous forme de comprimé (16) à base de Paracétamol (500 mg).","Il est impératif de respecter les posologies définies en fonction du poids de l'enfant et donc de choisir une présentation adaptée. Les âges approximatifs en fonction du poids sont donnés à titre d'information.\n" +
                "\n" +
                "La dose quotidienne de paracétamol recommandée est d'environ 60 mg/kg/jour, à répartir en 4 ou 6 prises, soit environ 15 mg/kg toutes les 6 heures ou 10 mg/kg toutes les 4 heures."));
        ps.Create(new Produit("Gaviscon ", 5, R.mipmap.gaviscon, "25 min", "Excipients : carbonate de calcium, carbomère (974 P), saccharine sodique, arôme fenouil (anéthol de fenouil, alcool benzylique), hydroxyde de sodium, érythrosine (E 127), eau purifiée. Conservateurs : parahydroxybenzoate de méthyle (E 218) et parahydroxybenzoate de propyle (E 216)","Ce médicament est indiqué dans le traitement du reflux gastro-oesophagien qui se traduit par des brûlures d’estomac (pyrosis), des remontées ou renvois acides et des aigreurs d’estomac.\n" +
                "\n","Il est impératif de respecter les posologies définies en fonction du poids de l'enfant et donc de choisir une présentation adaptée. Les âges approximatifs en fonction du poids sont donnés à titre d'information.\n" +
                "\n" +
                "La dose quotidienne de paracétamol recommandée est d'environ 60 mg/kg/jour, à répartir en 4 ou 6 prises, soit environ 15 mg/kg toutes les 6 heures ou 10 mg/kg toutes les 4 heures."));
        ps.Create(new Produit("Rinomicine", 4, R.mipmap.rinomicine, "25 min", "Paracetamol | Chlorphenamine | Salicylamide | Phenylephrine | Cafeine | Acide Ascorbique","Rinomicine® est indiqué dans le traitement symptomatique des : Etats grippaux : rhume, congestion nasale, catarrhe nasal et éternuement. Etats fébriles.: fièvre, courbatures, refroidissement, douleurs modérées ou élevées (telles que maux de tête).","Il est impératif de respecter les posologies définies en fonction du poids de l'enfant et donc de choisir une présentation adaptée. Les âges approximatifs en fonction du poids sont donnés à titre d'information.\n" +
                "\n" +
                "La dose quotidienne de paracétamol recommandée est d'environ 60 mg/kg/jour, à répartir en 4 ou 6 prises, soit environ 15 mg/kg toutes les 6 heures ou 10 mg/kg toutes les 4 heures."));
        ps.Create(new Produit("Fervex", 3, R.mipmap.fervex, "25 min", "gomme arabique, acide citrique, saccharinate de sodium, saccharose, arôme naturel antillais*. Excipients à effet notoire : saccharose (11,5 g par sachet), maltodextrine (source de glucose et de fructose) et traces d'éthanol et de sodium dans l'arôme","Ce médicament est indiqué chez les adultes (à partir de 15 ans) dans le traitement au cours des rhumes, rhinites, rhinopharyngites et des états grippaux","Il est impératif de respecter les posologies définies en fonction du poids de l'enfant et donc de choisir une présentation adaptée. Les âges approximatifs en fonction du poids sont donnés à titre d'information.\n" +
                "\n" +
                "La dose quotidienne de paracétamol recommandée est d'environ 60 mg/kg/jour, à répartir en 4 ou 6 prises, soit environ 15 mg/kg toutes les 6 heures ou 10 mg/kg toutes les 4 heures."));

        ps.Create(new Produit("Vitamine C", 3, R.mipmap.vitaminec, "25 min", "bicarbonate de sodium, acide citrique anhydre, saccharose, saccharine sodique, macrogol 6000, benzoate de sodium (E211), arôme orange (dont fructose, glucose et saccharose), jaune orangé S (E110).","La vitamine C est une vitamine hydrosoluble sensible à la chaleur et à la lumière jouant un rôle important dans le métabolisme de l'être humain et de nombreux autres mammifères. ","Il est impératif de respecter les posologies définies en fonction du poids de l'enfant et donc de choisir une présentation adaptée. Les âges approximatifs en fonction du poids sont donnés à titre d'information.\n" +
                "\n" +
                "La dose quotidienne de paracétamol recommandée est d'environ 60 mg/kg/jour, à répartir en 4 ou 6 prises, soit environ 15 mg/kg toutes les 6 heures ou 10 mg/kg toutes les 4 heures."));

        ps.Create(new Produit("Maxilase", 1, R.mipmap.sirop, "25 min", "carmellose calcique, povidone, acide stéarique, silice colloïdale anhydre, lactoglobuline lactose, gomme laque décirée blanchie, gomme arabique, saccharose, talc, dioxyde de titane (E171), jaune orangé S (E110), cire d'abeille blanche.","Maxilase comprimés est réservé à l'adulte et sa posologie est de 1 comprimé 3 fois par jour au cours des repas, à avaler, sans le craquer, avec un verre d'eau. Ce traitement ne doit pas être prolongé au-delà de 5 jours sans avis médical.","Il est impératif de respecter les posologies définies en fonction du poids de l'enfant et donc de choisir une présentation adaptée. Les âges approximatifs en fonction du poids sont donnés à titre d'information.\n" +
                "\n" +
                "La dose quotidienne de paracétamol recommandée est d'environ 60 mg/kg/jour, à répartir en 4 ou 6 prises, soit environ 15 mg/kg toutes les 6 heures ou 10 mg/kg toutes les 4 heures."));


        list.setAdapter(new PharmacieAdapter(this,ps.findAll()));


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                final TextView idf = view.findViewById(R.id.code);
                Intent intent = new Intent(ListPharmacieActivity.this, PharmacieDetail.class);
                Produit p = ps.findById(Integer.valueOf((String) idf.getText()));

                intent.putExtra("nom", p.getNom());
                intent.putExtra("nbr", p.getNbrIngredients());
                intent.putExtra("photo", String.valueOf(p.getPhoto()));
                intent.putExtra("duree", p.getDuree());
                intent.putExtra("detail", p.getDetaisIngred());
                intent.putExtra("desc", p.getDescription());
                intent.putExtra("pre", p.getPreparation());


                startActivity(intent);}
            });
    }

}