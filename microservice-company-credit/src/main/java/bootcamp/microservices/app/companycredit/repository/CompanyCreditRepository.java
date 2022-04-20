package bootcamp.microservices.app.companycredit.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import bootcamp.microservices.app.companycredit.documents.CompanyCredit;
import reactor.core.publisher.Mono;

public interface CompanyCreditRepository extends ReactiveMongoRepository<CompanyCredit, String> {

	public Mono<CompanyCredit> findByIdCompany(String idCompany);
}
