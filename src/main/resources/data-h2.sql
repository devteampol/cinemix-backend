DELETE FROM roles;
INSERT INTO roles (id, name) VALUES ('1', 'ROLE_USER');
INSERT INTO roles (id, name) VALUES ('2', 'ROLE_MODERATOR');
INSERT INTO roles (id, name) VALUES ('3', 'ROLE_ADMIN');
INSERT INTO users (
        id,
        email,
        password,
        username)
    VALUES (
        '1',
        'admin@mail.com',
        '$2a$10$vmqmLq.Q1dJgomfu9je7C.I9nbnCuXTahCgrSN9BT7IdINNtIHRsa', -- P@ssw0rd
        'admin'
);
INSERT INTO user_roles (user_id, role_id) VALUES ('1', '3');
INSERT INTO movies (id, author, title) VALUES ('1', 'Quentin Tarantino', 'Koronawirus');