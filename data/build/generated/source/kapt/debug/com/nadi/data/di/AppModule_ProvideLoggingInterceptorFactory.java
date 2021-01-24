// Generated by Dagger (https://dagger.dev).
package com.nadi.data.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import okhttp3.Interceptor;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideLoggingInterceptorFactory implements Factory<Interceptor> {
  @Override
  public Interceptor get() {
    return provideLoggingInterceptor();
  }

  public static AppModule_ProvideLoggingInterceptorFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Interceptor provideLoggingInterceptor() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideLoggingInterceptor());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideLoggingInterceptorFactory INSTANCE = new AppModule_ProvideLoggingInterceptorFactory();
  }
}