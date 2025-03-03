package app.netlify.dev4rju9.pokedex.repository

import app.netlify.dev4rju9.pokedex.data.remote.PokeApi
import app.netlify.dev4rju9.pokedex.data.remote.responses.Pokemon
import app.netlify.dev4rju9.pokedex.data.remote.responses.PokemonList
import app.netlify.dev4rju9.pokedex.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class PokemonRepository @Inject constructor (
    private val api: PokeApi
) {

    suspend fun getPokemonList (limit: Int, offset: Int) : Resource<PokemonList> {
        return try {
            Resource.Success(
                api.getPokemonList(limit, offset)
            )
        } catch (e: Exception) {
            return Resource.Error("An unknown error occurred")
        }
    }

    suspend fun getPokemon (pokemonName: String) : Resource<Pokemon> {
        return try {
            Resource.Success(
                api.getPokemonInfo(pokemonName)
            )
        } catch (e: Exception) {
            return Resource.Error("An unknown error occurred")
        }
    }

}