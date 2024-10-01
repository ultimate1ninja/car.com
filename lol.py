# List of car companies
car_companies = [
    {"name": "Toyota", "image": "https://via.placeholder.com/250"},
    {"name": "Honda", "image": "https://via.placeholder.com/250"},
    {"name": "Ford", "image": "https://via.placeholder.com/250"},
    {"name": "Chevrolet", "image": "https://via.placeholder.com/250"},
    {"name": "Nissan", "image": "https://via.placeholder.com/250"},
    {"name": "BMW", "image": "https://via.placeholder.com/250"},
    {"name": "Mercedes", "image": "https://via.placeholder.com/250"},
    {"name": "Hyundai", "image": "https://via.placeholder.com/250"},
    {"name": "Kia", "image": "https://via.placeholder.com/250"},
    {"name": "Volkswagen", "image": "https://via.placeholder.com/250"},
]

# Sort the car companies alphabetically by name
sorted_car_companies = sorted(car_companies, key=lambda x: x['name'])

# Print sorted car companies
for company in sorted_car_companies:
    print(f"Name: {company['name']}, Image: {company['image']}")
