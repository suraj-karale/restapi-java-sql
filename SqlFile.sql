CREATE TABLE usermgmt.users (
    user_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_name VARCHAR(255),
    full_name VARCHAR(255),
    last_name VARCHAR(255),
    email_id VARCHAR(255),
    contact_no VARCHAR(20)
);

INSERT INTO usermgmt.users (user_name, full_name, last_name, email_id, contact_no) VALUES
('john_doe', 'John Doe', 'Doe', 'john.doe@example.com', '123-456-7890'),
('jane_smith', 'Jane Smith', 'Smith', 'jane.smith@example.com', '987-654-3210'),
('alice_johnson', 'Alice Johnson', 'Johnson', 'alice.johnson@example.com', '555-123-4567');
