package br.com.albuquerque.eventmanagement.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "event")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(exclude = "participants")
@EqualsAndHashCode(of = "id")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name cannot be blank")
    @Column(nullable = false)
    private String name;

    @Column(length = 500)
    private String description;

    @NotBlank(message = "Location cannot be blank")
    @Column(nullable = false)
    private String location;

    @NotNull(message = "Start date cannot be null")
    @FutureOrPresent(message = "Start date must be in the future or present")
    @Column(nullable = false)
    private LocalDateTime startDate;

    @NotNull(message = "End date cannot be null")
    @FutureOrPresent(message = "End date must be in the future or present")
    @Column(nullable = false)
    private LocalDateTime endDate;

    @NotNull(message = "Maximum participants cannot be null")
    @Positive(message = "Maximum participants must be positive")
    @Column(nullable = false)
    private Integer maxParticipants;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "event_participants",
            joinColumns = @JoinColumn(name = "event_id"),
            inverseJoinColumns = @JoinColumn(name = "participant_id")
    )
    private Set<Participant> participants;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;
}
