# Write a python program that impliments a decorator to cache the result of a function.

def cache_result(func):
    cache = {}

    def wrapper(*args, **kwargs):
        key = (*args, *kwargs.items())

        if key in cache:
            print("Retrieving result from cache...")
            return cache[key]

        result = func(*args, **kwargs)
        cache[key] = result

        return result

    return wrapper


@cache_result
def calculate_multiply(x, y):
    print("Calculating the product of two numbers...")
    return x * y


print(calculate_multiply(4, 5))  
print(calculate_multiply(4, 5))  
print(calculate_multiply(5, 7))  
print(calculate_multiply(5, 7))  