package ru.kotov.notification.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ru.kotov.notification.model.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Integer> {
}
