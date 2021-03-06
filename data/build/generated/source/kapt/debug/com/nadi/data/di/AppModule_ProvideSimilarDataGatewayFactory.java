// Generated by Dagger (https://dagger.dev).
package com.nadi.data.di;

import com.nadi.core.similar.SimilarGateway;
import com.nadi.data.network.MovieAPIs;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideSimilarDataGatewayFactory implements Factory<SimilarGateway> {
  private final Provider<MovieAPIs> movieAPIsProvider;

  public AppModule_ProvideSimilarDataGatewayFactory(Provider<MovieAPIs> movieAPIsProvider) {
    this.movieAPIsProvider = movieAPIsProvider;
  }

  @Override
  public SimilarGateway get() {
    return provideSimilarDataGateway(movieAPIsProvider.get());
  }

  public static AppModule_ProvideSimilarDataGatewayFactory create(
      Provider<MovieAPIs> movieAPIsProvider) {
    return new AppModule_ProvideSimilarDataGatewayFactory(movieAPIsProvider);
  }

  public static SimilarGateway provideSimilarDataGateway(MovieAPIs movieAPIs) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideSimilarDataGateway(movieAPIs));
  }
}
