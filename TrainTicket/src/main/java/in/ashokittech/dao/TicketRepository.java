package in.ashokittech.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokittech.request.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,Long>{

}
