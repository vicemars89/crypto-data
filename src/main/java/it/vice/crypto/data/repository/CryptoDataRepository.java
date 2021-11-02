package it.vice.crypto.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.vice.crypto.data.entity.CryptoData;

public interface CryptoDataRepository extends JpaRepository<CryptoData, Long>{

}
