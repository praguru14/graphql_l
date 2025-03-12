//package com.graphql.learn;//package com.graphql.learn.resolvers;
//
//import com.graphql.learn.entities.PersonDetailsEntity;
//import com.graphql.learn.services.PerService;
//import graphql.kickstart.tools.GraphQLQueryResolver;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//@Component
//public class PerResolver implements GraphQLQueryResolver {
//
//    private final PerService perService;
//
//    public PerResolver(PerService perService) {
//        this.perService = perService;
//    }
//
//    public List<PersonDetailsEntity> getAllDetails() {
//        List<PersonDetailsEntity> details = perService.getAllDetails();
//        System.out.println("GraphQL - Fetched Details: " + details.size());
//        return details;
//    }
//
//    public PersonDetailsEntity getPersonByPno(String pno) {
//        PersonDetailsEntity detail = perService.getPersonByPno(pno);
//        System.out.println("GraphQL - Fetched Detail for PNO: " + pno + " -> " + detail);
//        return detail;
//    }
//}
