package com.example.silvanadorantes.desayunofitness;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by silvana on 13/03/16.
 */
public class Breakfasts {

    private static Breakfast[] breakfasts = {
            new Breakfast("Lunes",
                         "Huevos Fit con Batata y manzana",
                         "Es una batata (camote/boniato/sweet potato) cocida," +
                                 "aproximadamente de 120-150 gr., con dos huevos “fritos” (sin aceite)" +
                                 "encima de la batata le coloqué media manzana (o una manzana pequeña)" +
                                 "cocida, para hacerla rápido sólo la rebanan finito, la colocan en un" +
                                 "envase de vidrio con canela, la llevan al microondas por dos o tres" +
                                 "minutos y listo. Esta combinación es bien rica y balanceada, contiene" +
                                 "proteínas, carbohidratos de carga glucémica media a baja, que además es" +
                                 "libre de gluten y cargado de antioxidantes, la batata es realmente buena y" +
                                 "muy saludable, grasas buenas que aporta la yema, vitamina D, es un desayuno " +
                                 "que te va a dar mucha energía.\n",
                                 3f, R.drawable.desayuno_lunes),
            new Breakfast("Martes",
                    "Panquecas de Avena con Canela y semillas de Chia",
                    "Sólo licuan cuatro o cinco claras, un tercio de taza de avena en hojuelas," +
                            "una cucharada de semillas de chía o linaza molida, canela, edulcorante," +
                            "un chorrito de leche de almendras o agua, pueden agregar vainilla," +
                            "licuan bien y listo. Son altas en proteína, fibra, tienen la cantidad" +
                            "adecuada de calorías, les ayudará a controlar el apetito, ansiedad," +
                            "acelerar metabolismo y proteger masa muscular. Si eres hombre puedes" +
                            "incrementar las cantidades de claras de huevo y avena a casi el doble" +
                            "(suertudos, jeje) pueden comer todas las que salgan. Si son intolerantes" +
                            "al gluten pueden sustituir la avena por un cuarto de taza de harina de" +
                            "almendras o de coco.\n",
                            4f, R.drawable.desayuno_martes),
            new Breakfast("Miercoles",
                    "Avena Cocida con Granola Fit",
                    "Avena (1/3 taza) cocida con agua. Una vez lista le agregué una medida de proteína" +
                            "en polvo, encima tiene un poco de coco seco en hojuelas y una cucharada de" +
                            "granola fit (la granola es sin azúcar y solo a base de avena y almendras, no" +
                            "tiene otro cereal, generalmente las granolas son altísimas en calorías," +
                            "azúcar/carbos…)\n",
                    5f, R.drawable.desayuno_miercoles),
            new Breakfast("Jueves",
                    "Huevos Revueltos con Pavo bajo en sal y Batata al Horno",
                    "Huevo revuelto preparado con un huevo completo y tres claras, un poco de pavo sin sal," +
                            "para los que viven fuera de Venezuela se llama “No Salt oven roasted turkey breast” de" +
                            "la marca Boars head. Es el equivalente a usar pechuga de pollo desmenuzada, es lo que" +
                            "hago cuando estoy en Maracaibo, porque el jamón de pavo contiene demasiado sodio, más de" +
                            "400 mg. por cada 100 gr. de jamón. Y de carbohidrato complejo una batata al horno que luego" +
                            "aplasté en una sandwichera, queda buenísimo.\n",
                             3f, R.drawable.desayuno_jueves),
            new Breakfast("Viernes",
                         "Panquecas de Cholotate",
                         "¡Panquecas de chocolate! Super fáciles y rápidas de preparar, sólo licua 4 claras de huevo," +
                                 "una cucharada sopera de cacao en polvo, ese de repostería amargo, cuatro sobres de" +
                                 "stevia o edulcorante, un chorrito de vainilla, 1/3 de taza de avena en hojuelas y" +
                                 "un chorrito de agua o leche de almendras.\n",
                                  5f, R.drawable.desayuno_viernes),
            new Breakfast("Sabado",
                         "Panquecas de Avena",
                         "Panquecas de avena (1/3 Taza de avena + 4 claras + chorrito de agua + 1 cucharada de chia" +
                                 "o linaza molida + canela/stevia, licua todo y listo) con 1/3 de cambur picado +" +
                                 "1/2 cucharada de mantequilla de maní y goji berries (¡bombitas de antioxidantes!)" +
                                 "Acompaño las panquecas con una taza de café con leche de almendras casera.\n",
                                 4f, R.drawable.desayuno_sabado),
            new Breakfast("Domingo",
                          "Huevos Fritos con Pavo, Aguacate y Pan Integral",
                          "Este es un desayuno con todos los hierros, tiene proteínas, carbohidratos y grasas buenas." +
                           "¡Saludable y delicioso! Si tu dieta es limpia, comes 85 a 90% natural, haces ejercicio y estás" +
                                  "saludable no hay ningún problema en consumir uno o dos huevos enteros. Ahora, este es un" +
                                  "desayuno para quienes buscan “mantenerse”, si buscas perder grasa deberías hacer ciertos ajustes" +
                                  "dependiendo si eres hombre o mujer. En el caso de que seas mujer te recomiendo que elijas o grasa o" +
                                  "carbohidrato y sólo una fuente de grasa, es decir, aquí la yema aporta un poco de grasa y el aguacate" +
                                  "también, es un desayuno saludable pero no es uno que recomendaría para quienes quieren perder grasa," +
                                  "ahora yo estoy en fase de mantenimiento,de igual manera lo que hice fue controlar muy bien la cantidad" +
                                  "de cada uno de los alimentos, sólo hay 70 gr. de aguacate, un solo huevo, 1 rebanada pequeña de pan integral" +
                                  "que es a base de germinados altos en fibra (Ezekiel),y el pavo es uno que venden en Miami natural, sin sal," +
                                  "rebanado. Si viven en otro lado es el equivalente a comer pechuga de pollo a la plancha. Si estás en proceso" +
                                  "de pérdida de grasa te recomiendo que te vayas por el carbohidrato en la mañana,y dejes la grasa como el aguacate" +
                                  "para la noche,porq no eleva insulina a diferencia del carbohidrato. Si eres hombre puedes consumir un huevo más," +
                                  "misma cantidad de aguacate, y duplicar la cantidad de carbohidratos. Un hombre si puede perder grasa con un desayuno" +
                                  "de este tipo porque ellos tienen el doble de masa muscular y queman más calorías al día que nosotras ellos pueden ser" +
                                  "más flexibles con la alimentación porque el ambiente hormonal de ellos es distinto, totalmente injusto, ¿cierto?… Este tipo" +
                                  "de desayuno lo consumo en mis días altos de carbohidrato, generalmente alterno dos días con menos carbos, y un día con más," +
                                  "los días bajos tienen más grasa y los días altos en carbo tiene un poco menos de grasa al día. De igual manera cada cuerpo es" +
                                  "diferente, siempre hay excepciones, aprende a conocer tu cuerpo. Quería darles un ejemplo de un desayuno equilibrado ideal para" +
                                  "cuando quieres reponer reservas, incrementar energía y entrenar con fuerza.\n",
                                  5f, R.drawable.desayuno_domingo),

    };

    //Obtiene la lista de todos los desayunos

    public static List<Breakfast> getBreakfasts(){
        return Arrays.asList(breakfasts);
    }

    //Obtiene un desayuno basado en la posicion del Array

    public static Breakfast getBreakfastByPosition(int position){
        return breakfasts[position];
    }
}
