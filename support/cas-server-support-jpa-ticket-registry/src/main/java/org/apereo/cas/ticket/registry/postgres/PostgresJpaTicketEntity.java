package org.apereo.cas.ticket.registry.postgres;

import org.apereo.cas.ticket.registry.generic.JpaTicketEntity;

import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * This is {@link PostgresJpaTicketEntity}.
 *
 * @author Hal Deadman
 * @since 6.5.0
 */
@SuperBuilder
@NoArgsConstructor
@AttributeOverrides({
    @AttributeOverride(name = "body", column = @Column(columnDefinition = "text"))
})
@Table(name = "CasTickets")
@Entity(name = "PostgresJpaTicketEntity")
public class PostgresJpaTicketEntity extends JpaTicketEntity {
    private static final long serialVersionUID = 6546716187959834795L;
}
