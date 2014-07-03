package com.example.indianvegrecipes;


import java.io.IOException;

import org.xmlpull.v1.XmlPullParserException;

import android.support.v7.app.ActionBarActivity;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class RecipeDetailActivity extends ActionBarActivity {

	TextView ingrediants;
    TextView method;
    TextView serves;
    String stringIngrediant;
    String stringMethod;
    String stringServes;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_recipe_detail);
        ingrediants = (TextView)findViewById(R.id.textIDetails);
        method = (TextView)findViewById(R.id.textMDetails);
        serves = (TextView)findViewById(R.id.textSDetails);

		
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		
		Bundle bundle=getIntent().getExtras();
		int number=bundle.getInt("number");
		
		Resources resources=getResources();
		XmlResourceParser xml=resources.getXml(R.xml.details);
		
		try
        {
			while(xml.getEventType()!=XmlResourceParser.END_DOCUMENT)
			{
				if (xml.getEventType()==XmlResourceParser.START_TAG) {
					String name=xml.getName();
					if (name.equals("RecipeDetails")) {
						
						switch(number){
						case 0:
							if (xml.getAttributeValue(1).contains("Baby Corn Manchurian")){ 
							
							        setTitle("Baby Corn Manchurian");
							        stringServes = xml.getAttributeValue(2);
							        stringIngrediant = xml.getAttributeValue(3);
							        stringMethod = xml.getAttributeValue(4);
							        ingrediants.setText(stringIngrediant);
							        method.setText(stringMethod);
							        serves.setText(stringServes);
							}
		        			break;
		        		case 1:
		        			if (xml.getAttributeValue(1).contains("Chilli Paneer")){ 
								
						        setTitle("Dosa(Made with rice floor)");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 2:
		        			if (xml.getAttributeValue(1).contains("Chinese Bhel")){ 
								
						        setTitle("Chinese Bhel");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 3:
		        			if (xml.getAttributeValue(1).contains("Idli Manchurian")){ 
								
						        setTitle("Idli Manchurian");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 4:
		        			if (xml.getAttributeValue(1).contains("Manchow Soup")){ 
								
						        setTitle("Manchow Soup");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 5:
		        			if (xml.getAttributeValue(1).contains("Masala Papad")){ 
								
						        setTitle("Masala Papad");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 6:
		        			if (xml.getAttributeValue(1).contains("Paneer Tikka")){ 
								
						        setTitle("Paneer Tikka");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 7:
		        			if (xml.getAttributeValue(1).contains("Sweet Corn Soup")){ 
								
						        setTitle("Sweet Corn Soup");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 8:
		        			if (xml.getAttributeValue(1).contains("Tomato Soup")){ 
								
						        setTitle("Tomato Soup");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 9:
		        			if (xml.getAttributeValue(1).contains("Vegetable Manchurian Dry")){ 
								
						        setTitle("Vegetable Manchurian Dry");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 10:
		        			if (xml.getAttributeValue(1).contains("Vegetable Soup")){ 
								
						        setTitle("Vegetable Soup");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		
		        			
		        		case 101:
		        			if (xml.getAttributeValue(1).contains("Aloo Gobi Paratha")){ 
								
						        setTitle("Aloo Gobi Paratha");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 102:
		        			if (xml.getAttributeValue(1).contains("Dosa(Made with rice floor)")){ 
								
						        setTitle("Dosa(Made with rice floor)");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 103:
		        			if (xml.getAttributeValue(1).contains("Gojju Avalakki")){ 
								
						        setTitle("Gojju Avalakki");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 104:
		        			if (xml.getAttributeValue(1).contains("Onion Potato Poha")){ 
								
						        setTitle("Onion Potato Poha");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 105:
		        			if (xml.getAttributeValue(1).contains("Masala Dosa")){ 
								
						        setTitle("Masala Dosa");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 106:
		        			if (xml.getAttributeValue(1).contains("Masala Idli")){ 
								
						        setTitle("Masala Idli");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 107:
		        			if (xml.getAttributeValue(1).contains("Masala Paddu")){ 
								
						        setTitle("Masala Paddu");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 108:
		        			if (xml.getAttributeValue(1).contains("Misal Pav")){ 
								
						        setTitle("Misal Pav");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 109:
		        			if (xml.getAttributeValue(1).contains("Paneer Bhurji")){ 
								
						        setTitle("Paneer Bhurji");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 110:
		        			if (xml.getAttributeValue(1).contains("Puri Bhaji")){ 
								
						        setTitle("Puri Bhaji");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 111:
		        			if (xml.getAttributeValue(1).contains("Semiya Pulao")){ 
								
						        setTitle("Semiya Pulao");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 112:
		        			if (xml.getAttributeValue(1).contains("Soft Idli")){ 
								
						        setTitle("Soft Idli");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 113:
		        			if (xml.getAttributeValue(1).contains("Tomato Omlete")){ 
								
						        setTitle("Tomato Omlete");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 114:
		        			if (xml.getAttributeValue(1).contains("Uttappam")){ 
								
						        setTitle("Uttappam");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 115:
		        			if (xml.getAttributeValue(1).contains("Veg Grilled Sandwitch")){ 
								
						        setTitle("Veg Grilled Sandwitch");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		
		        			
		        		case 201:
		        			if (xml.getAttributeValue(1).contains("Aloo Vada(Bhonda)")){ 
								
						        setTitle("Aloo Vada(Bhonda)");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 202:
		        			if (xml.getAttributeValue(1).contains("Bhel Puri Chat")){ 
								
						        setTitle("Bhel Puri Chat");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 203:
		        			if (xml.getAttributeValue(1).contains("Corn Fingers")){ 
								
						        setTitle("Corn Fingers");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 204:
		        			if (xml.getAttributeValue(1).contains("Corn Vada")){ 
								
						        setTitle("Corn Vada");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 205:
		        			if (xml.getAttributeValue(1).contains("Dabeli Spicy Potato Sandwich")){ 
								
						        setTitle("Dabeli Spicy Potato Sandwich");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 206:
		        			if (xml.getAttributeValue(1).contains("Dahi Vada")){ 
								
						        setTitle("Dahi Vada");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 207:
		        			if (xml.getAttributeValue(1).contains("Mirchi Vada")){ 
								
						        setTitle("Mirchi Vada");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 208:
		        			if (xml.getAttributeValue(1).contains("Moong Dal Vada")){ 
								
						        setTitle("Moong Dal Vada");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 209:
		        			if (xml.getAttributeValue(1).contains("Murukku")){ 
								
						        setTitle("Murukku");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 210:
		        			if (xml.getAttributeValue(1).contains("Peanut Chat")){ 
								
						        setTitle("Peanut Chat");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 211:
		        			if (xml.getAttributeValue(1).contains("Potato Paneer Tots")){ 
								
						        setTitle("Potato Paneer Tots");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 212:
		        			if (xml.getAttributeValue(1).contains("Potato Skins")){ 
								
						        setTitle("Potato Skins");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 213:
		        			if (xml.getAttributeValue(1).contains("Rava Dhokla")){ 
								
						        setTitle("Rava Dhokla");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 214:
		        			if (xml.getAttributeValue(1).contains("Vada Pav")){ 
								
						        setTitle("Vada Pav");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 215:
		        			if (xml.getAttributeValue(1).contains("Mixed Vegetable Pakora")){ 
								
						        setTitle("Mixed Vegetable Pakora");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        			
		        		case 301:
		        			if (xml.getAttributeValue(1).contains("Bisibele Bath")){ 
								
						        setTitle("Bisibele Bath");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 302:
		        			if (xml.getAttributeValue(1).contains("Cauliflower Peas Curry")){ 
								
						        setTitle("Cauliflower Peas Curry");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 303:
		        			if (xml.getAttributeValue(1).contains("Cucumber Curry")){ 
								
						        setTitle("Cucumber Curry");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 304:
		        			if (xml.getAttributeValue(1).contains("Curd Rice")){ 
								
						        setTitle("Curd Rice");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 305:
		        			if (xml.getAttributeValue(1).contains("Mixed Vegetable Kurma")){ 
								
						        setTitle("Mixed Vegetable Kurma");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 306:
		        			if (xml.getAttributeValue(1).contains("Paneer Potato Patties")){ 
								
						        setTitle("Paneer Potato Patties");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 307:
		        			if (xml.getAttributeValue(1).contains("Paneer Spring Rolls")){ 
								
						        setTitle("Paneer Spring Rolls");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 308:
		        			if (xml.getAttributeValue(1).contains("Poha Bread Vada")){ 
								
						        setTitle("Poha Bread Vada");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 309:
		        			if (xml.getAttributeValue(1).contains("Sabudani Kichdi")){ 
								
						        setTitle("Sabudani Kichdi");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 310:
		        			if (xml.getAttributeValue(1).contains("Sabudani Vada")){ 
								
						        setTitle("Sabudani Vada");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 311:
		        			if (xml.getAttributeValue(1).contains("Samosa")){ 
								
						        setTitle("Samosa");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 312:
		        			if (xml.getAttributeValue(1).contains("Spicy Almonds")){ 
								
						        setTitle("Spicy Almonds");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 313:
		        			if (xml.getAttributeValue(1).contains("Spicy Puffed Rice")){ 
								
						        setTitle("Spicy Puffed Rice");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 314:
		        			if (xml.getAttributeValue(1).contains("Spicy Rice Noodles")){ 
								
						        setTitle("Spicy Rice Noodles");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 315:
		        			if (xml.getAttributeValue(1).contains("Spinach Vada")){ 
								
						        setTitle("Spinach Vada");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 316:
		        			if (xml.getAttributeValue(1).contains("Stuffed Egg Plant")){ 
								
						        setTitle("Stuffed Egg Plant");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 317:
		        			if (xml.getAttributeValue(1).contains("Sweet Potato Curry")){ 
								
						        setTitle("Sweet Potato Curry");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 318:
		        			if (xml.getAttributeValue(1).contains("Tindora Tomato Gravy Curry")){ 
								
						        setTitle("Tindora Tomato Gravy Curry");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 319:
		        			if (xml.getAttributeValue(1).contains("Vangibath")){ 
								
						        setTitle("Vangibath");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
		        		case 320:
		        			if (xml.getAttributeValue(1).contains("Vegetable Vermicelli Upma")){ 
								
						        setTitle("Vegetable Vermicelli Upma");
						        stringServes = xml.getAttributeValue(2);
						        stringIngrediant = xml.getAttributeValue(3);
						        stringMethod = xml.getAttributeValue(4);
						        ingrediants.setText(stringIngrediant);
						        method.setText(stringMethod);
						        serves.setText(stringServes);
		        			}
		        			break;
						}
						
					}
				}
				xml.next();
			}
        }
        catch (XmlPullParserException xmlpullparserexception)
        {
            xmlpullparserexception.printStackTrace();
            return;
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
            return;
        }
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.recipe_detail, menu);
		return true;
	}

	

	

}
