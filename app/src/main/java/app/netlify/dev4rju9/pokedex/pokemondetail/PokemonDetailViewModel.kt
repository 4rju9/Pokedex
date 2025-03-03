package app.netlify.dev4rju9.pokedex.pokemondetail

import androidx.lifecycle.ViewModel
import app.netlify.dev4rju9.pokedex.data.remote.responses.Pokemon
import app.netlify.dev4rju9.pokedex.repository.PokemonRepository
import app.netlify.dev4rju9.pokedex.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemon (pokemonName: String): Resource<Pokemon> {
        return repository.getPokemon(pokemonName)
    }
}