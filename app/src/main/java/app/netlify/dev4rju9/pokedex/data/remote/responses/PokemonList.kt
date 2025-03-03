package app.netlify.dev4rju9.pokedex.data.remote.responses

data class PokemonList (
    val count: Long,
    val next: String,
    val previous: Any?,
    val results: List<Result>,
)

data class Result(
    val name: String,
    val url: String,
)