package br.com.tecsinapse.camel.cdi;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources({"classpath:env.properties"})
public interface EnvProperties extends Config {

    @Key("camel.route.twitter")
    boolean camelRouteTwitter();

    @Key("camel.route.feed")
    boolean camelRouteFeed();

    @Key("camel.route.email")
    boolean camelRouteEmail();

    @Key("twitter.consumerKey")
    String twitterConsumerKey();

    @Key("twitter.consumerSecret")
    String twitterConsumerSecret();

    @Key("twitter.accessToken")
    String twitterAccessToken();

    @Key("twitter.accessTokenSecret")
    String twitterAccessTokenSecret();

    @Key("email.username")
    String emailUsername();

    @Key("email.password")
    String emailPassword();
}
