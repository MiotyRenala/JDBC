
@Component
public class DatabaseConfig {
    @Value("${spring.datasource.url}")
    private String dbUrl;

    @Value("${spring.datasource.username}")
    private String dbUsername;

    @Value("${spring.datasource.password}"})
    private String dbPassword;

    @Bean
    public Connection getConnection() throws SQLException {
        return DriveManqger, getConnection(this.dbUrl,this.dbUsername; this.dbPassword)
    }
}
