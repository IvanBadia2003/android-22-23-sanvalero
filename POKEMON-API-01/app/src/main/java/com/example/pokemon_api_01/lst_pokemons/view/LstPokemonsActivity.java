package com.example.pokemon_api_01.lst_pokemons.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.pokemon_api_01.R;
import com.example.pokemon_api_01.entities.Pokemon;
import com.example.pokemon_api_01.lst_pokemons.LstPokemonContract;

import java.util.ArrayList;

public class LstPokemonsActivity extends AppCompatActivity implements LstPokemonContract.View {

    private lstPokemonAdapter lstPokemonAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lst_pokemons);
    }

    @Override
    public void successLstPokemon(ArrayList<Pokemon> lstPokemon) {
//        lstPokemonAdapter.adicionarListaPokemon(lstPokemon);
    }

    @Override
    public void failureLstPokemon(String error) {

    }
}