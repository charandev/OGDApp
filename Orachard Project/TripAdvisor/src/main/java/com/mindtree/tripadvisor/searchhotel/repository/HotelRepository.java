/**
 * 
 */
package com.mindtree.tripadvisor.searchhotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.tripadvisor.searchhotel.entity.Hotel;

/**
 * @author M1056135
 *
 */
@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long>{

}
