import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DataSource {
    @Bean
    public DriverManagerDataSource dataSource(){
        DriverManagerDataSource source = new DriverManagerDataSource();
        source.setDriverClassName("org.postgresql.Driver");
        source.setUrl("jdbc:postgres://xmmazemfflgbkj:a323bc337c559fffd0ec7029daaf60f03712cdb1df41ca8629fe8429f0a7a607@ec2-54-85-113-73.compute-1.amazonaws.com:5432/d423nfcf5dbjf7");
        source.setUsername("xmmazemfflgbkj");
        source.setPassword("a323bc337c559fffd0ec7029daaf60f03712cdb1df41ca8629fe8429f0a7a607");
        return source;
    }

    @Bean
    public NamedParameterJdbcTemplate namedParameterJdbcTemplate(){
        NamedParameterJdbcTemplate namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(this.dataSource());
        return namedParameterJdbcTemplate;
    }

}
