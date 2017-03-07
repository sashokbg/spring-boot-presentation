//package bg.alexander.config;
//
//import bg.alexander.formatters.DateFormatter;
//import bg.alexander.formatters.RoleFormatter;
//import bg.alexander.formatters.UserFormatter;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.support.ResourceBundleMessageSource;
//import org.springframework.format.support.FormattingConversionServiceFactoryBean;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//import org.springframework.web.servlet.LocaleResolver;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
//import org.springframework.web.servlet.i18n.SessionLocaleResolver;
//
//import java.util.HashSet;
//import java.util.Locale;
//import java.util.Set;
//
//@Configuration
//@EnableWebMvc
//@ComponentScan
//@EntityScan
//@EnableTransactionManagement
//public class AppConfig extends WebMvcConfigurerAdapter {
//    @Override
//    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
//    }
//    @Bean
//    private FormattingConversionServiceFactoryBean conversionService(RoleFormatter roleFormatter, UserFormatter userFormatter, DateFormatter dateFormatter){
//        FormattingConversionServiceFactoryBean formattingConversionServiceFactoryBean = new FormattingConversionServiceFactoryBean();
//        Set<Object> formatters = new HashSet<>();
//        formatters.add(roleFormatter);
//        formatters.add(userFormatter);
//        formatters.add(dateFormatter);
//
//        formattingConversionServiceFactoryBean.setFormatters(formatters);
//        return formattingConversionServiceFactoryBean;
//    }
//    @Bean
//    public ResourceBundleMessageSource messageSource() {
//        ResourceBundleMessageSource source = new ResourceBundleMessageSource();
//        source.setBasename("i18n/messages");
//        source.setUseCodeAsDefaultMessage(true);
//        return source;
//    }
//    @Bean
//    public LocaleResolver localeResolver() {
//        SessionLocaleResolver localeResolver = new SessionLocaleResolver();
//        localeResolver.setDefaultLocale(Locale.ENGLISH); // change this
//        return localeResolver;
//    }
//    @Bean
//    LocaleChangeInterceptor localeInterceptor() {
//        LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
//        return localeChangeInterceptor;
//    }
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(localeInterceptor());
//    }
//}
