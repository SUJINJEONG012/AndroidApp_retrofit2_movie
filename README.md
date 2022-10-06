# AndroidApp_retrofit2_movie


## 클론코딩

<a href="https://www.arthlimchiu.com/2019/10/02/make-a-movies-app-part-1.html">참고한 사이트</a>


코틀린언어에서 `retrofit2`와 영화 `API`를 이용해 구현

`interface` , `data class` , `object` 파일을 활용해서 작성



```kotlin
interface Api{
//인기있는
    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "키발급번호",
        @Query("page") page: Int,
        @Query("language") language : String = "ko" //외국api라 한글로 언어변경
    ): Call<GetMoviesResponse>
    
  }

```





<img width="386" alt="1" src="https://user-images.githubusercontent.com/56811978/194195235-7ff5b1dc-22a9-423e-8c3a-85c2c4b1d8a5.png">

