package ru.skypro.avito.service;

import org.springframework.web.multipart.MultipartFile;
import ru.skypro.avito.model.User;
import ru.skypro.avito.dto.UserDto;

/**
 * Сервис для работы с пользователем
 */
public interface UserService {
    UserDto updateUser(UserDto updatedUser);
    UserDto getUser();
    void updatePassword(String newPassword, String currentPassword);
    void updateAvatar(MultipartFile file);
    /**
     * Получение пользователя из контекста
     * Обслуживающий метод
     */
    User findUserFromContext();
}
