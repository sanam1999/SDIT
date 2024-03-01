
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define TABLE_SIZE 100

typedef struct Contact {
    int id;
    char name[50];
    char phone[15];
    char email[50];
    struct Contact *next;
} Contact;

typedef struct HashTable {
    Contact *table[TABLE_SIZE];
} HashTable;

Contact* create(int id, char name[], char phone[], char email[]) {
    Contact *new = (Contact*)malloc(sizeof(Contact));
    if (new == NULL) {
        printf("Memory allocation failed.\n");
        exit(EXIT_FAILURE);
    }
    new->id = id;
    strcpy(new->name, name);
    strcpy(new->phone, phone);
    strcpy(new->email, email);
    new->next = NULL;
    return new;
}

int hash(int id) {
    return id % TABLE_SIZE;
}

void add(HashTable *hash_table, int id, char name[], char phone[], char email[]) {
    int index = hash(id);
    Contact *new = create(id, name, phone, email);
    if (hash_table->table[index] == NULL) {
        hash_table->table[index] = new;
    } else {
        Contact *temp = hash_table->table[index];
        while (temp->next != NULL) {
            temp = temp->next;
        }
        temp->next = new;
    }
    printf("Contact added successfully.\n");
}

void search(HashTable *hash_table, int id) {
    int index = hash(id);
    Contact *temp = hash_table->table[index];
    while (temp != NULL) {
        if (temp->id == id) {
            printf("Contact ID: %d\nName: %s\nPhone Number: %s\nEmail: %s\n", temp->id, temp->name, temp->phone, temp->email);
            return;
        }
        temp = temp->next;
    }
    printf("Contact not found.\n");
}

void update(HashTable *hash_table, int id, char phone[], char email[]) {
    int index = hash(id);
    Contact *temp = hash_table->table[index];
    while (temp != NULL) {
        if (temp->id == id) {
            strcpy(temp->phone, phone);
            strcpy(temp->email, email);
            printf("Contact details updated successfully.\n");
            return;
        }
        temp = temp->next;
    }
    printf("Contact not found.\n");
}

void del(HashTable *hash_table, int id) {
    int index = hash(id);
    Contact *temp = hash_table->table[index];
    Contact *prev = NULL;
    while (temp != NULL) {
        if (temp->id == id) {
            if (prev == NULL) {
                hash_table->table[index] = temp->next;
            } else {
                prev->next = temp->next;
            }
            free(temp);
            printf("Contact deleted successfully.\n");
            return;
        }
        prev = temp;
        temp = temp->next;
    }
    printf("Contact not found.\n");
}

void display(HashTable *hash_table) {
    printf("Contact List:\n");
    for (int i = 0; i < TABLE_SIZE; i++) {
        Contact *temp = hash_table->table[i];
        while (temp != NULL) {
            printf("Contact ID: %d\nName: %s\nPhone Number: %s\nEmail: %s\n\n", temp->id, temp->name, temp->phone, temp->email);
            temp = temp->next;
        }
    }
}

int main() {
    HashTable hash_table;
    for (int i = 0; i < TABLE_SIZE; i++) {
        hash_table.table[i] = NULL;
    }

    int choice;
    do {
        printf("\nContact Management System Menu:\n");
        printf("1. Add Contact\n");
        printf("2. Search Contact\n");
        printf("3. Update Contact\n");
        printf("4. Delete Contact\n");
        printf("5. Display Contacts\n");
        printf("6. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch(choice) {
            case 1: {
                int id;
                char name[50], phone[15], email[50];
                printf("Enter contact ID: ");
                scanf("%d", &id);
                printf("Enter name: ");
                scanf("%s", name);
                printf("Enter phone number: ");
                scanf("%s", phone);
                printf("Enter email: ");
                scanf("%s", email);
                add(&hash_table, id, name, phone, email);
                break;
            }
            case 2: {
                int id;
                printf("Enter contact ID to search: ");
                scanf("%d", &id);
                search(&hash_table, id);
                break;
            }
            case 3: {
                int id;
                char phone[15], email[50];
                printf("Enter contact ID to update: ");
                scanf("%d", &id);
                printf("Enter new phone number: ");
                scanf("%s", phone);
                printf("Enter new email: ");
                scanf("%s", email);
                update(&hash_table, id, phone, email);
                break;
            }
            case 4: {
                int id;
                printf("Enter contact ID to delete: ");
                scanf("%d", &id);
                del(&hash_table, id);
                break;
            }
            case 5:
                display(&hash_table);
                break;
            case 6:
                printf("Exiting...\n");
                break;
            default:
                printf("Invalid choice. Please try again.\n");
        }
    } while(choice != 6);

    return 0;
}