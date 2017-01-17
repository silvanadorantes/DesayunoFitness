package com.example.silvanadorantes.desayunofitness;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.NavUtils;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    private static final String EXTRA_POSITION = "com.example.silvanadorantes.desayunofitness.extra.POSITION";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Usted a seleccionado este desayuno fit", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        // Se obtiene la posición del item seleccionado
        int position = getIntent().getIntExtra(EXTRA_POSITION, -1);
        // Carga los datos en la vista
        setupViews(position);

        Window window = getWindow();
        // Elegir transiciones
        switch (position){
            // EXPLODE
            case 0:
                Explode t0 = new Explode();
                window.setEnterTransition(t0);
                break;
            // SLIDE
            case 1:
                Slide t1 = new Slide();
                t1.setSlideEdge(Gravity.END);
                window.setEnterTransition(t1);
                break;
            // FADE
            case 2:
                Fade t2 = new Fade();
                window.setEnterTransition(t2);
                break;
            // PERSONALIZADA
            case 3:
                Transition t3 = TransitionInflater.from(this)
                                         .inflateTransition(R.transition.detail_enter_transition);
                window.setEnterTransition(t3);
                break;
            // EVENTOS DE TRANSICIÓN
            case 4:
                Fade t4 = new Fade();
                t4.addListener(
                        new Transition.TransitionListener() {
                            @Override
                            public void onTransitionStart(Transition transition) {

                            }

                            @Override
                            public void onTransitionEnd(Transition transition) {
                                Snackbar.make(
                                        findViewById(R.id.coordinatorDetail),
                                        "Terminó la transición",
                                        Snackbar.LENGTH_SHORT)
                                        .show();

                            }

                            @Override
                            public void onTransitionCancel(Transition transition) {

                            }

                            @Override
                            public void onTransitionPause(Transition transition) {

                            }

                            @Override
                            public void onTransitionResume(Transition transition) {

                            }
                        }
                );

                window.setEnterTransition(t4);
                break;
            case 5:
                window.setEnterTransition(null);
                break;
        }

    }

    private void setupViews(int position){
        TextView dia_semana = (TextView) findViewById(R.id.detail_dia_semana);
        TextView nombre = (TextView) findViewById(R.id.detail_nombre);
        TextView descripcion = (TextView) findViewById(R.id.detail_descripcion);
        RatingBar rating = (RatingBar) findViewById(R.id.detail_rating);
        ImageView imagen = (ImageView) findViewById(R.id.detail_imagen);

        Breakfast detailBreakfast = Breakfasts.getBreakfastByPosition(position);
        dia_semana.setText(detailBreakfast.getDia_semana());
        nombre.setText(detailBreakfast.getNombre());
        descripcion.setText(detailBreakfast.getDescripcion());
        rating.setRating(detailBreakfast.getRating());
        Picasso.with(this).load(detailBreakfast.getImagen()).into(imagen);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            default:
                return super.onOptionsItemSelected(item);
            case android.R.id.home:
                // Obtener intent de la actividad padre
                Intent upIntent = NavUtils.getParentActivityIntent(this);
                upIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);

                // Comprobar si DetailActivity no se creó desde CourseActivity
                if (NavUtils.shouldUpRecreateTask(this, upIntent)
                        || this.isTaskRoot()){
                    // Construir de nuevo la tarea para ligar ambas actividades
                    TaskStackBuilder.create(this)
                            .addNextIntentWithParentStack(upIntent)
                            .startActivities();
                }

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
                    // Terminar con el método correspondiente para Android 5.x
                    this.finishAfterTransition();
                    return true;
                }

                // Dejar que el sistema maneje el comportamiento del up button

                return false;

        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    public static void launch(Activity context, int position, View sharedView){
        Intent intent = new Intent(context, DetailActivity.class);
        intent.putExtra(EXTRA_POSITION, position);

        // Los elementos 4, 5 y 6 usan elementos compartidos,

        if (position >= 3){
            ActivityOptions options0 = ActivityOptions
                    .makeSceneTransitionAnimation(context, sharedView, sharedView.getTransitionName());
            context.startActivity(intent, options0.toBundle());

        }else {
            ActivityOptions options0 = ActivityOptions.makeSceneTransitionAnimation(context);
            context.startActivity(intent, options0.toBundle());
        }


    }


}
