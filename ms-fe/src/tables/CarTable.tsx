import React, {useEffect, useState} from 'react';
import {Table} from "antd";
import {FETCH_BASE_URL} from "../App";

export function CarTable() {
    const [data, setData] = useState<any>([]);

    useEffect(() => {
        (async () => {
            try {
                const response = await fetch(`${FETCH_BASE_URL}/cars`);
                setData(await response.json());
            } catch (e) {
                console.error('Fetch error', e);
            }
        })();
    }, []);

    const columns = [
        {
            title: 'id',
            dataIndex: 'id',
            key: 'id',
        },
        {
            title: 'userid',
            dataIndex: 'userId',
            key: 'userid',
        },
        {
            title: 'Manufacturer',
            dataIndex: 'make',
            key: 'make',
        },
        {
            title: 'Model',
            dataIndex: 'model',
            key: 'model',
        },
        {
            title: 'Year',
            dataIndex: 'year',
            key: 'year',
        }
    ];

    return <Table columns={columns} dataSource={data} rowKey="id" pagination={false} loading={!data}/>;
}
