package app.netlify.dev4rju9.pokedex.di

import app.netlify.dev4rju9.pokedex.data.remote.PokeApi
import app.netlify.dev4rju9.pokedex.repository.PokemonRepository
import app.netlify.dev4rju9.pokedex.util.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun providePokemonRepository (
        api: PokeApi
    ) = PokemonRepository(api)

    @Singleton
    @Provides
    fun providesPokeApi () : PokeApi {
        return Retrofit.Builder()
            .addConverterFactory(
                GsonConverterFactory.create()
            )
            .baseUrl(BASE_URL)
            .build()
            .create(PokeApi::class.java)
    }

}