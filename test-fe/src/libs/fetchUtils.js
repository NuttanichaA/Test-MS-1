async function getItems(url) {
  try {
    const data = await fetch(url);
    const items = await data.json();
    return items;
  } catch (error) {
    throw new Error("can not get your items");
  }
}
async function getItemById(url, id) {
  try {
    const data = await fetch(`${url}/${id}`);
    const item = await data.json();
    return item;
  } catch (error) {
    if (data.status === 404) return undefined;
    throw new Error("can not get your item");
  }
}

async function deleteItemById(url, id) {
  try {
    const res = await fetch(`${url}/${id}`, {
      method: "DELETE",
    });
    return res.status;
  } catch (error) {
    throw new Error("can not delete your item");
  }
}

async function addItem(url, newItem) {
  try {
    const existingItemsRes = await fetch(url);
    const existingItems = await existingItemsRes.json();

    if (existingItems.some((item) => item.id === newItem.id)) {
      throw new Error("ID already exists");
    }

    const res = await fetch(url, {
      method: "POST",
      headers: {
        "content-type": "application/json",
      },
      body: JSON.stringify({
        ...newItem,
      }),
    });
    const addedItem = await res.json();
    return addedItem;
  } catch (error) {
    throw new Error(error.message || 'Cannot add your item');
  }
}

async function editItem(url, id, editItem) {
  try {
    const res = await fetch(`${url}/${id}`, {
      method: "PUT",
      headers: {
        "content-type": "application/json",
      },
      body: JSON.stringify({
        ...editItem,
      }),
    });
    const editedItem = await res.json();
    return editedItem;
  } catch (error) {
    throw new Error("can not edit your item");
  }
}
export { getItems, getItemById, deleteItemById, addItem, editItem };
