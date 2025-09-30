// package com.example.fix_initiator.config;
// package com.example.fix_initiator.config_rm;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import quickfix.*;

// @Configuration
// public class InitiatorConfiguration {

//     @Bean
//     public MessageFactory messageFactory() {
//         return new DefaultMessageFactory();
//     }

//     @Bean
//     public SessionSettings sessionSettings() throws ConfigError {
//         return new SessionSettings("quickfixj-initiator.cfg");
//     }

//     @Bean
//     public LogFactory logFactory() {
//         return new ScreenLogFactory();
//     }

//     @Bean
//     public MessageStoreFactory messageStoreFactory() {
//         return new MemoryStoreFactory();
//     }

//     @Bean(destroyMethod = "stop") // Spring will stop initiator on shutdown
//     public Initiator initiator(Application application,
//                                MessageStoreFactory messageStoreFactory,
//                                SessionSettings sessionSettings,
//                                LogFactory logFactory,
//                                MessageFactory messageFactory) throws ConfigError {
//         SocketInitiator socketInitiator =
//                 new SocketInitiator(application, messageStoreFactory, sessionSettings, logFactory, messageFactory);
//         socketInitiator.start();
//         return socketInitiator;
//     }
// }
